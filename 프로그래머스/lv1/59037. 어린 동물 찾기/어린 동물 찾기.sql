select ANIMAL_ID, NAME
from animal_ins
where INTAKE_CONDITION != 'Aged'
order by animal_id asc